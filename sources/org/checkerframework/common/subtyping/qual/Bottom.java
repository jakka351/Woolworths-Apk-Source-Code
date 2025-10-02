package org.checkerframework.common.subtyping.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations
@Documented
@SubtypeOf
/* loaded from: classes8.dex */
public @interface Bottom {
}
