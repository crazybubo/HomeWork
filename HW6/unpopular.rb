require 'csv' 
sum=Dir["*.csv"].length
files =Dir.glob("*.csv")
Array.new student=Array.new(29){0}
for file in files
	CSV.foreach (file) do |row|
	for num in row
		if (num.to_i > 0)
		student[num.to_i-1] = student[num.to_i-1].to_i + 1	
		end
	end	
   end
end


unpop = student[0]
for blah in 0..sum
  print (blah+1).to_s ":" + student[blah].to_s + "\n\n"
  
  if unpop > Student[blah]
  unpop = student[blah]
  student_infinity = blah + 1
  end
end	

print "The most unpopular student in this class is student number: " + student_infinity.to_s + " and he loses this election with this number of votes" + unpop.to_s + "\n"

