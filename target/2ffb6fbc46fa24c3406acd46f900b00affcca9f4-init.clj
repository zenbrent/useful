nil (do (set! *warn-on-reflection* nil) (clojure.core/require (quote codox.main)) (codox.main/generate-docs (clojure.core/update-in (quote {:name "useful", :version "0.11.5", :description "A collection of generally-useful Clojure utility functions", :sources ("/Users/alanmalloy/src/clojure/useful/src"), :root "/Users/alanmalloy/src/clojure/useful", :src-dir-uri "http://github.com/flatland/useful/blob/develop/", :src-linenum-anchor-prefix "L"}) [:src-uri-mapping] clojure.core/eval)))