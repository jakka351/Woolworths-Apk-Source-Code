package au.com.woolworths.android.onesite.utils;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumExtKt {
    public static final void a(SharedPreferences.Editor editor, RewardsState rewardsState) {
        Intrinsics.h(editor, "<this>");
        Intrinsics.g(editor.putString("rewards_state", rewardsState != null ? rewardsState.name() : null), "putString(...)");
    }
}
