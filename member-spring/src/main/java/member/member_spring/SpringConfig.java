package member.member_spring;

import member.member_spring.domain.Member;
import member.member_spring.repository.MemberRepository;
import member.member_spring.repository.MemoryMemberRepository;
import member.member_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();

    }

}
