package org.africalib.shoponline.backend.repository;

import org.africalib.shoponline.backend.entity.Item;
import org.africalib.shoponline.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
