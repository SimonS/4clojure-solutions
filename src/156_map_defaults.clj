(fn [default l] (into {} (map #(hash-map % default) l)))

