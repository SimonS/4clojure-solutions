(fn [l] (set (->> (map #(hash-map (clojure.string/join "" (sort %)) [%]) l)
                  (apply merge-with concat)
                  vals
                  (map set)
                  (filter #(> (count %) 1)))))
