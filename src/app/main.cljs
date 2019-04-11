(ns app.main
  (:require [reagent.core :as reagent]
            [re-frame.core :as rf]
            [clojure.string :as str]
            [app.containers.root]))

(defn init! []
  (reagent/render [app.containers.root/root]
                  (js/document.getElementById "app")))

(defn main! []
  (println "[main]: loading")
  (init!))

(defn reload! []
  (println "[main] reloading")
  (init!))
