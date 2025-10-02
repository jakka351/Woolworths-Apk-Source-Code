package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
class AbstractSignatureParts$$Lambda$1 implements Function1 {
    public final TypeEnhancementInfo d;
    public final JavaTypeQualifiers[] e;

    public AbstractSignatureParts$$Lambda$1(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.d = typeEnhancementInfo;
        this.e = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaTypeQualifiers javaTypeQualifiers;
        int iIntValue = ((Number) obj).intValue();
        TypeEnhancementInfo typeEnhancementInfo = this.d;
        if (typeEnhancementInfo != null && (javaTypeQualifiers = (JavaTypeQualifiers) typeEnhancementInfo.f24455a.get(Integer.valueOf(iIntValue))) != null) {
            return javaTypeQualifiers;
        }
        if (iIntValue >= 0) {
            JavaTypeQualifiers[] javaTypeQualifiersArr = this.e;
            if (iIntValue < javaTypeQualifiersArr.length) {
                return javaTypeQualifiersArr[iIntValue];
            }
        }
        return JavaTypeQualifiers.e;
    }
}
