(fn [x y] 
   (set (mapcat (fn [z] (map #(vector z %) y)) x)))

