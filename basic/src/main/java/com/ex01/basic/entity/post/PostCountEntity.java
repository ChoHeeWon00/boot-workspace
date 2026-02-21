package com.ex01.basic.entity.post;

import com.ex01.basic.entity.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "post_count",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"member_id", "post_id"})
        }
)
@Getter
@Setter
@NoArgsConstructor
public class PostCountEntity {

}
