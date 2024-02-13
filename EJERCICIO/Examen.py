import time
import random

# Implementación de QuickSort
def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

def medir_tiempo(algoritmo, datos):
    inicio = time.time()
    algoritmo(datos)
    fin = time.time()
    return fin - inicio

datos = [random.randint(0, 1000) for _ in range(4000)]

tiempo_quicksort = medir_tiempo(quick_sort, datos.copy())

print("Tiempo de ejecución de QuickSort para 4000 datos:", tiempo_quicksort, "segundos")