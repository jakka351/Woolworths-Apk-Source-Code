package io.branch.referral;

import io.branch.referral.Branch;
import io.branch.referral.util.SharingUtil;

/* loaded from: classes7.dex */
public class NativeShareLinkManager {

    /* renamed from: a, reason: collision with root package name */
    public static volatile NativeShareLinkManager f23859a;

    /* renamed from: io.branch.referral.NativeShareLinkManager$1, reason: invalid class name */
    class AnonymousClass1 implements Branch.BranchLinkCreateListener {
        @Override // io.branch.referral.Branch.BranchLinkCreateListener
        public final void e(String str, BranchError branchError) {
            if (branchError == null) {
                SharingUtil.a(str);
                throw null;
            }
            BranchLogger.e("Unable to share link " + branchError.f23850a);
            int i = branchError.b;
            if (i == -113 || i == -117) {
                SharingUtil.a(str);
                throw null;
            }
        }
    }

    public class NativeLinkShareListenerWrapper implements Branch.BranchNativeLinkShareListener {
    }

    public static NativeShareLinkManager a() {
        if (f23859a == null) {
            synchronized (NativeShareLinkManager.class) {
                try {
                    if (f23859a == null) {
                        f23859a = new NativeShareLinkManager();
                    }
                } finally {
                }
            }
        }
        return f23859a;
    }
}
