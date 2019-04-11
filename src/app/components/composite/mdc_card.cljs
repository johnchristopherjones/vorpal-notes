(ns app.components.composite.mdc-card
  (:require [app.lib :as lib]
            [reagent.core :as reagent]
            [re-frame.core :as rf]
            [clojure.string :as str]
            [app.lib :refer [cs]]))


(defn card-primary-action [action-content]
  [:div.mdc-card__primary-action action-content])


(defn card-primary-content [content & {:keys [media-url]}]
  [:div.mdc-card__primary-action {:tabindex 0}
   (when media-url [:div.mdc-card__media.mdc-card__media--16-9
                    {:style {:background-image (str "url(" media-url ")")}}])
   [:div.mdc-typography.mdc-typography--body2 content]])


(defn headline6 [text]
  [:h2.mdc-typography.mdc-typography--headline6 text])


(defn subtitle2 [text]
  [:h3.mdc-typography.mdc-typography--subtitle2 text])


(defn body2 [text]
  [:div.mdc-typography.mdc-typography--body2 text])


(defn card
  "Material Design Card component"
  [options card-content & {:keys [title subtitle]}]
   [:div.mdc-card options
    [:div.mdc-card__primary-action {:tabindex 0}
     (when title [headline6 title])
     (when subtitle [subtitle2 subtitle])]
    [card-primary-content card-content]])


