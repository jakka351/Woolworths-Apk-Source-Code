package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.MutableState;
import io.jsonwebtoken.JwtParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Function0 function0 = (Function0) this.f;
                MutableState mutableState = (MutableState) this.g;
                if (this.e == 0) {
                    mutableState.setValue(Boolean.TRUE);
                }
                function0.invoke();
                return Unit.f24250a;
            default:
                String str = (String) this.f;
                EnumDescriptor enumDescriptor = (EnumDescriptor) this.g;
                int i = this.e;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
                for (int i2 = 0; i2 < i; i2++) {
                    serialDescriptorArr[i2] = SerialDescriptorsKt.e(str + JwtParser.SEPARATOR_CHAR + enumDescriptor.e[i2], StructureKind.OBJECT.f24777a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
        }
    }
}
