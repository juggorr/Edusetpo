package com.seosam.edusetpo.lessonTag.entity;

import com.seosam.edusetpo.tutor.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name="lesson_tag")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "lesson_tag_id", nullable = false)
    private Long lessonTagId;

    @Column (name = "tag_id", nullable = false)
    private Long tagId;

    @ManyToOne
//    @JoinColumn(name = "tag_id", updatable = false, insertable = false)
    @JoinColumn(name = "tag_id", referencedColumnName = "tag_id", insertable = false, updatable = false)
    private Tag tag;

    @Column (name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column (name = "tutor_id", nullable = false)
    private Long tutorId;

}
