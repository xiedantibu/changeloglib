/*******************************************************************************
 * Copyright (c) 2013 Gabriele Mariotti.
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
 ******************************************************************************/
package it.gmariotti.changelibs.demo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.changelibs.demo.R;

/**
 * ChangeLog Example with custom xml file without bullet point.
 *
 * <pre>
 * <changelog bulletedList="false">
 *    .....
 * </changelog>
 * </pre>
 *
 * @author Gabriele Mariotti (gabri.mariotti@gmail.com)
 */
public class WithoutBulletPointFragment extends BaseFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.demo_changelog_fragment_withoutbullet, container, false);
    }

    @Override
    public int getTitleResourceId() {
        return R.string.demo_changelog_title_withoutbulletpoint;
    }
}
