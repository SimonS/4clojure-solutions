(fn [& coll] 
    ((complement nil?) (and (some true? coll) (some false? coll))))

