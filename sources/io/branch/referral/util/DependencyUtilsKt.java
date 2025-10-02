package io.branch.referral.util;

import io.branch.referral.BranchLogger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DependencyUtilsKt {
    public static final boolean a(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            BranchLogger.e("Could not find " + str + ". If expected, import the dependency into your app.");
            return false;
        }
    }
}
