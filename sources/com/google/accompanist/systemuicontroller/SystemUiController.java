package com.google.accompanist.systemuicontroller;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/systemuicontroller/SystemUiController;", "", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SystemUiController {
    default void b(long j, boolean z, Function1 transformColorForLightContent) {
        Intrinsics.h(transformColorForLightContent, "transformColorForLightContent");
        e(j, z, transformColorForLightContent);
        d(j, z, transformColorForLightContent);
    }

    void d(long j, boolean z, Function1 function1);

    void e(long j, boolean z, Function1 function1);

    void f(boolean z);
}
