import { NavBar } from "../../components/navBar/NavBar";
import { LongButton, ShortButtonFixed } from "./../../components/button/Button";

export const Student = () => {
  return (
    <div>
      <div>강잼민</div>
      <div>
        <ShortButtonFixed variant="danger">비활성화</ShortButtonFixed>
        <ShortButtonFixed variant="primary">수정</ShortButtonFixed>
      </div>
      <div>수강과목</div>
      <div>대충 수강과목들이 생겨날 곳</div>
      <div>학생</div>
      <div>학생번호</div>
      <div>학부모</div>
      <div>학부모번호</div>
      <div>상담내역</div>
      <LongButton variant="success">인증코드 SMS 보내기</LongButton>
    </div>
  );
};
