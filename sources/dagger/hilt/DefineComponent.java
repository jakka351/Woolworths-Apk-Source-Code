package dagger.hilt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: parent */
@Target({ElementType.TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface DefineComponent {

    @Target({ElementType.TYPE})
    @GeneratesRootInput
    @Retention(RetentionPolicy.CLASS)
    public @interface Builder {
    }
}
