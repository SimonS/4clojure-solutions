(fn [l n]
   (reduce 
        #(concat %1 (repeat n %2)) 
        [] 
        l))

