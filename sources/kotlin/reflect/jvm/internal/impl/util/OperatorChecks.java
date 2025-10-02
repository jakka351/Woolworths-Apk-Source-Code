package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;
import kotlin.text.Regex;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OperatorChecks extends AbstractModifierChecks {

    /* renamed from: a, reason: collision with root package name */
    public static final List f24645a;

    static {
        Name name = OperatorNameConventions.i;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(1);
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.b;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, atLeast});
        Checks checks2 = new Checks(OperatorNameConventions.j, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, OperatorChecks$$Lambda$0.d);
        Name name2 = OperatorNameConventions.f24646a;
        ValueParameterCountCheck.AtLeast atLeast2 = new ValueParameterCountCheck.AtLeast(2);
        NoDefaultAndVarargsCheck noDefaultAndVarargsCheck = NoDefaultAndVarargsCheck.f24644a;
        IsKPropertyCheck isKPropertyCheck = IsKPropertyCheck.f24641a;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, atLeast2, isKPropertyCheck});
        Checks checks4 = new Checks(OperatorNameConventions.b, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(3), isKPropertyCheck});
        Checks checks5 = new Checks(OperatorNameConventions.c, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.Equals(), isKPropertyCheck});
        Checks checks6 = new Checks(OperatorNameConventions.g, new Check[]{memberOrExtension});
        Name name3 = OperatorNameConventions.f;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.c;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.b;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck, returnsBoolean});
        Name name4 = OperatorNameConventions.h;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.b;
        Checks checks8 = new Checks(name4, new Check[]{memberOrExtension, noValueParameters});
        Checks checks9 = new Checks(OperatorNameConventions.k, new Check[]{memberOrExtension, noValueParameters});
        Checks checks10 = new Checks(OperatorNameConventions.l, new Check[]{memberOrExtension, noValueParameters, returnsBoolean});
        Checks checks11 = new Checks(OperatorNameConventions.p, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks12 = new Checks(OperatorNameConventions.q, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks13 = new Checks(OperatorNameConventions.d, new Check[]{MemberKindCheck.Member.b}, OperatorChecks$$Lambda$1.d);
        Checks checks14 = new Checks(OperatorNameConventions.e, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.c, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks15 = new Checks(OperatorNameConventions.t, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks16 = new Checks(OperatorNameConventions.s, new Check[]{memberOrExtension, noValueParameters});
        Checks checks17 = new Checks(CollectionsKt.R(OperatorNameConventions.n, OperatorNameConventions.o), new Check[]{memberOrExtension}, OperatorChecks$$Lambda$2.d);
        Checks checks18 = new Checks(OperatorNameConventions.x, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.c, singleValueParameter, noDefaultAndVarargsCheck});
        Regex regex = OperatorNameConventions.m;
        Intrinsics.h(regex, "regex");
        f24645a = CollectionsKt.R(checks, checks2, checks3, checks4, checks5, checks6, checks7, checks8, checks9, checks10, checks11, checks12, checks13, checks14, checks15, checks16, checks17, checks18, new Checks(null, regex, null, Checks.AnonymousClass3.d, (Check[]) Arrays.copyOf(new Check[]{memberOrExtension, noValueParameters}, 2)));
    }
}
