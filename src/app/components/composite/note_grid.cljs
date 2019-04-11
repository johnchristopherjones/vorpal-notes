(ns app.components.composite.note-grid
  (:require [app.lib :as lib]
            [reagent.core :as reagent]
            [re-frame.core :as rf]
            [clojure.string :as str]
            [app.lib :refer [cs]]))

(defn note
  ([contents] [note {} contents])
  ([options contents]
   (let [expanded (reagent/atom false)]
     (fn [options contents]
       [:div.note
        (merge options {:on-click #(swap! expanded not)
                        :class (cs (:class options) (when @expanded "expanded"))})
        contents
        [:span.material-icons.mdc-fab__icon "fullscreen"]]))))

(defn grid-item
  "Create a single cell in a grid."
  ([content]
   [grid-item {} content])
  ([options & content]
   (let [expanded (reagent/atom false)]
     (fn [options & content]
       [:div.grid-item
        (into options {:style {:height "100%"}
                       :on-click #(swap! expanded not)
                       :class (cs (:class options) "mdc-card" (when @expanded "expanded"))})
        content]))))

(defn grid [& components]
  "Create a grid container"
  [:div.grid
   (for [component components]
     [grid-item component])])
