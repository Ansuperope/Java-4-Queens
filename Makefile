JAVAC = javac
JAVA  = java

MAIN = Main
ZIP = extraCredit

SOURCES = *.java
CLASSES = *.class

.PHONY: all run clean save zip


all:
	$(JAVAC) -d . $(SOURCES)


run: all
	$(JAVA) -cp . $(MAIN)

# cleans up files
clean:
	rm -f $(CLASSES)

# save progress, git commands
save:
	git add .

# make zip file
zip:
	rm -f $(ZIP).zip
	zip -r $(ZIP).zip $(SOURCES) README.md -x "*.class"