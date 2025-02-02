/*
 * Copyright 2015. Pureum Choe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.massivcode.androidmusicplayer.managers;

import androidx.fragment.app.Fragment;

import com.massivcode.androidmusicplayer.fragments.ArtistFragment;
import com.massivcode.androidmusicplayer.fragments.PlayerFragment;
import com.massivcode.androidmusicplayer.fragments.PlaylistFragment;
import com.massivcode.androidmusicplayer.fragments.SongsFragment;


public class Manager {

    public static final Class[] FRAGMENTS = new Class[] {
            PlayerFragment.class,
            PlaylistFragment.class,
            ArtistFragment.class,
            SongsFragment.class
    };

    private Manager() {}

    public static Fragment getInstance(int position) {
        try {
            return (Fragment)FRAGMENTS[position].newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}