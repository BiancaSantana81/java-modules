## Colors
WHITE := \033[1;37m
PINK := \033[1;35m

## LIBS
LIB_DIR=../../lib
JUNIT_LIB=$(LIB_DIR)/junit.jar:$(LIB_DIR)/engine.jar

## SOURCES FILES
SRC_DIR=src/
MAIN_DIR=$(SRC_DIR)/main
TEST_DIR=$(SRC_DIR)/test

# OUTPUT DIRECTORY
OUTPUT_DIR=target
OUTPUT=$(OUTPUT_DIR)/classes
TEST_OUTPUT=$(OUTPUT_DIR)/test-classes

## Arquivos fonte (localiza todos os .java no MAIN_DIR e TEST_DIR)
MAIN_SOURCES=$(wildcard $(MAIN_DIR)/*.java)
TEST_SOURCES=$(wildcard $(TEST_DIR)/*.java)

## Criação do diretório de saída
$(OUTPUT_DIR):
	mkdir -p $(OUTPUT)
	mkdir -p $(TEST_OUTPUT)

## Compilar todos os arquivos juntos
all: $(OUTPUT) $(TEST_OUTPUT)

$(OUTPUT): $(MAIN_SOURCES) | $(OUTPUT_DIR)
	@if [ -z "$(MAIN_SOURCES)" ]; then \
		echo "$(WHITE)Nenhum arquivo fonte encontrado em $(MAIN_DIR)"; \
		exit 1; \
	fi
	@echo "$(WHITE) Compiling main sources..."
	javac -cp $(JUNIT_LIB) -d $(OUTPUT) $(MAIN_SOURCES)

$(TEST_OUTPUT): $(TEST_SOURCES) | $(OUTPUT_DIR)
	@if [ -z "$(TEST_SOURCES)" ]; then \
		echo "$(WHITE)Nenhum arquivo de teste encontrado em $(TEST_DIR)"; \
		exit 1; \
	fi
	@echo "$(WHITE) Compiling test sources..."
	javac -cp $(JUNIT_LIB):$(OUTPUT) -d $(TEST_OUTPUT) $(TEST_SOURCES)

## Executar os testes
run-tests: $(OUTPUT) $(TEST_OUTPUT)
	@echo "$(PINK) Running tests... 🎯"
	java -cp $(JUNIT_LIB):$(OUTPUT):$(TEST_OUTPUT) org.junit.platform.console.ConsoleLauncher --scan-classpath

## Executar o programa principal
run: $(OUTPUT)
	@echo "Executando Main..."
	java -cp $(OUTPUT) main.Main

## Limpar arquivos compilados
clean:
	rm -rf $(OUTPUT) $(TEST_OUTPUT)

fclean: clean
	rm -rf target
	@echo "$(PINK) Cleaning all compiled files... 🧼$(WHITE)"
	@echo "Complete cleaning!"

re: clean all

.PHONY: all clean re run
