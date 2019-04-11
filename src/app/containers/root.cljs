(ns app.containers.root
  (:require [app.lib :as lib]
            [reagent.core :as reagent]
            [re-frame.core :as rf]
            [clojure.string :as str]
            [app.components.composite.note-grid :refer [grid grid-item note]]
            [app.components.composite.mdc-card :refer [card]]))

(defn root []
  [:<>
   [:link {:rel "stylesheet" :href "css/main.css"}]
   [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
   [:div#header "header"]
   [:div#sidebar "sidebar"]
   (into [grid [note "Big"]]
         (repeat 20 [note "Repeated"]))
   [:div#footer "footer"]])