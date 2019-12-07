(ns todo-mvc.components
  (:require [helix.core :as hx]))

(defmacro title [& args]
  `(hx/$ Title ~@args))

(defmacro app-footer [& args]
  `(hx/$ AppFooter ~@args))

(defmacro new-todo [& args]
  `(hx/$ NewTodo ~@args))

(defmacro todo-item [& args]
  `(hx/$ TodoItem ~@args))
