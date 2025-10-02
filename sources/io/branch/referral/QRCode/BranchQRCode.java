package io.branch.referral.QRCode;

/* loaded from: classes7.dex */
public class BranchQRCode {

    /* renamed from: io.branch.referral.QRCode.BranchQRCode$1, reason: invalid class name */
    class AnonymousClass1 implements BranchQRCodeRequestHandler {
    }

    /* renamed from: io.branch.referral.QRCode.BranchQRCode$2, reason: invalid class name */
    class AnonymousClass2 implements BranchQRCodeDataHandler {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BranchImageFormat {
        public static final /* synthetic */ BranchImageFormat[] d = {new BranchImageFormat("JPEG", 0), new BranchImageFormat("PNG", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        BranchImageFormat EF5;

        public static BranchImageFormat valueOf(String str) {
            return (BranchImageFormat) Enum.valueOf(BranchImageFormat.class, str);
        }

        public static BranchImageFormat[] values() {
            return (BranchImageFormat[]) d.clone();
        }
    }

    public interface BranchQRCodeDataHandler<T> {
    }

    public interface BranchQRCodeImageHandler<T> {
    }

    public interface BranchQRCodeRequestHandler<T> {
    }
}
