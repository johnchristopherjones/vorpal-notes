(ns app.lib
  (:require [clojure.string :as str]))

(println "[lib] loading")

;; CSS class utility from:
; https://purelyfunctional.tv/guide/reagent/
(defn cs [& names]
  "Concat class names together."
  (str/join " " (filter identity names)))


; `cs` but with clean whitespace
#_(defn join-classes [& classes]
  "Combine space-delimited lists of classes."
  (->> classes
       (mapcat #(str/split % #"\s+"))
       (filter identity)
       (str/join " ")))


(defn add-classes [{:keys [class] :as options} & classes]
  "Add classes to Hiccup object."
  (assoc options :class (apply cs class classes)))


(comment
  (join-classes "button button-primary" "button-primary__warn") ; => "button button-primary button-primary__warn"

  (def options {:class "button button-primary"})

  (add-classes options "button-warn action-button" "ripple-effect"))
