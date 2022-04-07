package accessingdata;

import accessingdata.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepo extends JpaRepository<Member, Long> {
    List<Member> findByMemberLastName(@Param("memberLastName") String memberLastName);
    List<Member> findByMemberFirstName(@Param("memberFirstName") String memberFirstName);
    List<Member> findByMemberAddress(@Param("memberAddress") String memberAddress);
    List<Member> findByMemberEmail(@Param("memberEmail") String memberEmail);
    List<Member> findByMembershipStartDate(@Param("membershipStartDate") String membershipStartDate);
    List<Member> findByMembershipDuration(@Param("membershipDuration") int membershipDuration);
    List<Member> findByMembershipType(@Param("membershipType") String membershipType);
    List<Member> findByTournaments_Id(@Param("id") long id);

}
