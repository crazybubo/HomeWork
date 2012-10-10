# Tehnologichno uchilishte Elektronni sistemi kym TU Sofiq.
# 11 A klas
# Nomer 15
# Liuboslav Dimitrov Jordanov
# Prochita razlichnite vidove skriptovi ezici ot edna kolonka ot CSV fail i izvejda broq im.




require 'csv'

def process_file_with_csv
	f = File.open("/home/student11a/11a/klasa.csv", 'r')
	rub=0
	pyth=0
	per=0
	content = f.read
	result=0
	content.each_line do |line|
		array = line.split(",")
		if array[4] == "Ruby"
			rub=rub+1
		elsif array[4] == "Python" 
			pyth=pyth+1
		elsif array[4] == "Perl"
			per=per+1
		else
			print "nqma vuveden skriptov ezik"
		end
	print rub
	print pyth
	print per
		result = result + array[4].to_i
	end
	p result
end

	process_file

