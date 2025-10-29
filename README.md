# Comparação de Algoritmos de Ordenação

Trabalho de comparação entre **6 algoritmos de ordenação**.

## 🔢 Algoritmos Implementados
- Comb Sort  
- Gnome Sort  
- Bucket Sort  
- Bubble Sort (com flag de parada)  
- Selection Sort  
- Cocktail Sort  

Cada algoritmo conta:
- **Número de iterações (laços)**  
- **Número de trocas (swaps)**  

---

## 🧮 Vetores Utilizados
```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}; // semi ordenado
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}; // ordenado
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};  // invertido
```
---

## 📊 Exemplo de Saída
```java
VETOR 1: SEMI ORDENADO 
GnomeSort -> iterações: 160 | trocas: 74
CocktailSort -> iterações: 122 | trocas: 59
CombSort -> iterações: 91 | trocas: 36
BubbleSort -> iterações: 135 | trocas: 67
BucketSort -> iterações: 95 | trocas: 20
SelectionSort -> iterações: 190 | trocas: 19
```
---

## 🏁 Ranking de Desempenho Esperado

| Critério                     | Melhor Algoritmo Esperado           |
| ---------------------------- | ----------------------------------- |
| Menos iterações              | **Comb Sort** ou **Bucket Sort**    |
| Menos trocas                 | **Selection Sort**                  |
| Melhor caso (vetor ordenado) | **Bubble Sort** / **Cocktail Sort** |
| Pior caso (vetor invertido)  | **Comb Sort**                       |
| Médio caso (semi ordenado)   | **Comb Sort** ou **Bucket Sort**    |

👉 O Comb Sort apresentou o melhor equilíbrio entre desempenho e simplicidade.

👉 O Selection Sort teve menos trocas, mas mais iterações.

👉 Os algoritmos Bubble e Cocktail se destacaram no melhor caso.

<img width="428" height="464" alt="image" src="https://github.com/user-attachments/assets/e6bd3d38-42c2-459a-88a4-d289354e5d42" />

