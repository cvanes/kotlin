/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/box/typealias")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class TypealiasTestGenerated extends AbstractTypealiasTest {
    public void testAllFilesPresentInTypealias() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/typealias"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("localTypeAlias.kt")
    public void testLocalTypeAlias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/typealias/localTypeAlias.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/typealias/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("typeAliasConstructor.kt")
    public void testTypeAliasConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/typealias/typeAliasConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("typeAliasObject.kt")
    public void testTypeAliasObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/typealias/typeAliasObject.kt");
        doTest(fileName);
    }
}
