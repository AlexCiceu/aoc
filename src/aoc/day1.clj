(ns aoc.day1
    [:require [clojure.string :as str]])

(defn dayOne [])
    (def input (slurp "resources/day1.txt"))
    (def splitVector (str/split-lines input))

    (doseq [x splitVector] 
        (doseq [y splitVector]
            (doseq [z splitVector]
                (if (= 2020 (+ (read-string x) (read-string y) (read-string z))) 
                        (println (* (read-string x) (read-string y) (read-string z)))))))
