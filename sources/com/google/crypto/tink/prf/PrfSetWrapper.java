package com.google.crypto.tink.prf;

import YU.a;
import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Immutable
/* loaded from: classes.dex */
public class PrfSetWrapper implements PrimitiveWrapper<PrfSet> {

    /* loaded from: classes6.dex */
    public static class WrappedPrfSet extends PrfSet {

        /* renamed from: a, reason: collision with root package name */
        public final Map f15011a;
        public final int b;

        public WrappedPrfSet(PrimitiveSet primitiveSet) throws GeneralSecurityException {
            byte[] bArr = CryptoFormat.f14969a;
            if (primitiveSet.a(bArr).isEmpty()) {
                throw new GeneralSecurityException("No primitives provided.");
            }
            PrimitiveSet.Entry entry = primitiveSet.b;
            if (entry == null) {
                throw new GeneralSecurityException("Primary key not set.");
            }
            this.b = entry.e;
            List<PrimitiveSet.Entry> listA = primitiveSet.a(bArr);
            HashMap map = new HashMap();
            for (PrimitiveSet.Entry entry2 : listA) {
                OutputPrefixType outputPrefixType = entry2.d;
                Object obj = entry2.f14982a;
                int i = entry2.e;
                if (!outputPrefixType.equals(OutputPrefixType.RAW)) {
                    throw new GeneralSecurityException(a.e(i, "Key ", " has non raw prefix type"));
                }
                PrfSet prfSet = (PrfSet) obj;
                if (prfSet.a().size() > 1) {
                    throw new GeneralSecurityException(a.d(i, "More PRFs than expected in KeyTypeManager for key "));
                }
                map.put(Integer.valueOf(i), prfSet.a().get(Integer.valueOf(prfSet.b())));
            }
            this.f15011a = Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public final Map a() {
            return this.f15011a;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public final int b() {
            return this.b;
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return PrfSet.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedPrfSet(primitiveSet);
    }
}
