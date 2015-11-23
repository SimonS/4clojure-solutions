(fn [sep src]
    (rest (flatten (map #(vector sep %) src))))

