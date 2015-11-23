#((fn [n l] 
    (concat (drop n l) (take n l)))
  (mod (+ %1 (count %2)) (count %2)) %2)

