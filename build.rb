#!/usr/bin/ruby

require 'fileutils'

def directories_excluding_bin
  excluded_directories = ["bin"]

  all_files = Dir.glob('*')

  return all_files.select do |file|
    next if excluded_directories.include?(file)
    File.directory?(file)
  end
end

def create_bin
  FileUtils.rm_rf('bin')
  FileUtils.mkdir_p('bin')
end

def compile_java_files_in_directories directories
  for directory in directories
    puts "building #{directory}"
    system("javac -d bin #{directory}/*.java")
  end
end

def main
  create_bin()
  valid_directories = directories_excluding_bin()
  compile_java_files_in_directories(valid_directories)
end

main
