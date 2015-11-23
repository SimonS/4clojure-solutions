(fn [coll n] (map last
    (filter #(pos? (rem (first %) n)) 
        (map-indexed #(vector (inc %1) %2) coll))))

