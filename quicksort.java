private void quickSort(int[] arrays)
    {
        subQuickSort(arrays, 0, arrays.length - 1);
    }
    
    private void subQuickSort(int[] arrays, int start, int end)
    {
        if (start >= end)
        {
            return;
        }
        int middleIndex = subQuickSortCore(arrays, start, end);
        subQuickSort(arrays, start, middleIndex - 1);
        subQuickSort(arrays, middleIndex + 1, end);
    }
    
    private int subQuickSortCore(int[] arrays, int start, int end)
    {
        int middleValue = arrays[start];
        while (start < end)
        {
            while (arrays[end] >= middleValue && start < end)
            {
                end--;
            }
            arrays[start] = arrays[end];
            while (arrays[start] <= middleValue && start < end)
            {
                start++;
            }
            arrays[end] = arrays[start];
        }
        arrays[start] = middleValue;
        return start;
    }
    