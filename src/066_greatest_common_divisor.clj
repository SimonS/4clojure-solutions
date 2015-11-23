#((fn [dividend divisor] 
      (if (= (rem dividend divisor) 0)
         divisor
         (recur divisor (rem dividend divisor)))
     ) (max %1 %2) (min %1 %2) )

