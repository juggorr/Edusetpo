import { Outlet } from "react-router-dom";
import { NavBar } from "../components/navBar/NavBar";
import style from "./NomalPage.module.css";

export const NomalPage = () => {
  return (
    <div className={style.NomalPage}>
      <Outlet />
      <NavBar />
    </div>
  );
};
