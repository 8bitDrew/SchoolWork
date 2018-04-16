# Andrew Cox
# Week 8 Debug

if File.exist?("TestDirectory") then
	puts "TestDirectory folder found"
else
	puts "TestDirectory folder created"
	Dir.mkdir("TestDirectory")
end