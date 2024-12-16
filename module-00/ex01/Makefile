## Diretórios
SRC_DIR=src/main
OUTPUT_DIR=target/classes

## LIBS
LIB_DIR=../../lib
JUNIT_LIB=$(LIB_DIR)/junit.jar:$(LIB_DIR)/engine.jar

## Arquivos fonte
SOURCES=$(wildcard $(SRC_DIR)/*.java)

## Criação do diretório de saída
$(OUTPUT_DIR):
	mkdir -p $(OUTPUT_DIR)

## Compilar todos os arquivos juntos
all: $(OUTPUT_DIR)
	@echo "Compilando todos os arquivos..."
	javac -d $(OUTPUT_DIR) $(SOURCES)

## Executar o programa principal
run: all
	@echo "Executando Main..."
	java -cp $(OUTPUT_DIR) main.Main

## Limpar arquivos compilados
clean:
	rm -rf $(OUTPUT_DIR)

fclean: clean
	rm -rf target
	@echo "$(PINK) Cleaning all compiled files... 🧼$(WHITE)"
	@echo "Complete cleaning!"

re: clean all

.PHONY: all clean re run
