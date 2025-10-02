package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public static final class Contract {
        public static final Contract d;
        public static final Contract e;
        public static final Contract f;
        public static final /* synthetic */ Contract[] g;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            d = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            e = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            f = contract3;
            g = new Contract[]{contract, contract2, contract3};
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public static final class Result {
        public static final Result d;
        public static final Result e;
        public static final Result f;
        public static final /* synthetic */ Result[] g;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            d = result;
            Result result2 = new Result("INCOMPATIBLE", 1);
            e = result2;
            Result result3 = new Result("UNKNOWN", 2);
            f = result3;
            g = new Result[]{result, result2, result3};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) g.clone();
        }
    }

    Contract a();

    Result b(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor);
}
