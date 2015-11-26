(fn [n] (take n ((fn primes [s]
                   (cons (first s) (lazy-seq (primes 
                                            (filter #(not= 0 (mod % (first s))) 
                                                    (rest s)))))) 
                 (iterate inc 2))))
