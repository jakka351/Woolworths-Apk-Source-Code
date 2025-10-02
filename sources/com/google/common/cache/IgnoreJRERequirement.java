package com.google.common.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
@interface IgnoreJRERequirement {
}
