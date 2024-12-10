## Colors
WHITE := \033[1;37m
PINK := \033[1;35m

## LIBS
LIB_DIR=../../lib
JUNIT_LIB=$(LIB_DIR)/junit.jar:$(LIB_DIR)/engine.jar

## SOURCE FILES
SRC_DIR=src
MAIN_DIR=src/main/
TEST_DIR=src/test/

## OUTPUT DIRECTORY
OUTPUT_DIR=target
OUTPUT=$(OUTPUT_DIR)/classes
TEST_OUTPUT=$(OUTPUT_DIR)/test-classes

## SOURCES (Localiza todos os .java no MAIN_DIR)
MAIN_SOURCES=$(wildcard $(MAIN_DIR)*.java)
MAIN_CLASSES=$(MAIN_SOURCES:$(MAIN_DIR)%.java=$(OUTPUT)/%.class)

## Creating output directory
$(OUTPUT_DIR):
	mkdir -p $(OUTPUT_DIR)
	mkdir -p $(TEST_OUTPUT)

## Compilação dos arquivos fonte (código principal)
all: $(MAIN_CLASSES)

$(OUTPUT)/%.class: $(MAIN_DIR)%.java | $(OUTPUT_DIR)
	@echo "$(WHITE)   Compiling $<... "
	javac -cp $(JUNIT_LIB) -d $(OUTPUT) $<

## Compilação dos arquivos de teste
$(TEST_OUTPUT)/%.class: $(TEST_DIR)%.java | $(OUTPUT_DIR)
	@echo "$(WHITE)   Compiling test $<... "
	javac -cp $(JUNIT_LIB):$(OUTPUT) -d $(TEST_OUTPUT) $<

## Executar os testes
run-tests: $(TEST_OUTPUT)/MegaphoneTest.class $(MAIN_CLASSES)
	@echo "$(PINK) Running tests... 🎯"
	java -cp $(JUNIT_LIB):$(OUTPUT):$(TEST_OUTPUT) org.junit.platform.console.ConsoleLauncher --scan-classpath

## Limpar arquivos compilados
clean:
	rm -rf $(OUTPUT_DIR)

fclean: clean
	@echo "$(PINK) Cleaning all compiled files... 🧼$(WHITE)"
	rm -f $(OUTPUT)

re: fclean all

.PHONY: all clean fclean re run-tests
