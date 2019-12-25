package com.example.android.lagosguide;

public class Word {

    /**
     * name descriptions of locations
     */
    private String mNameDescription;


    private int mImageIcon = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param nameDescription is the name of the particular list location we are looking at
     * @param imageIcon       is the image resource id
     */

    public Word(String nameDescription, int imageIcon) {
        mNameDescription = nameDescription;
        mImageIcon = imageIcon;
    }

    /**
     * Get the name description.
     */
    public String getNameDescription() {
        return mNameDescription;
    }


    /**
     * Get the image icon
     */
    public int getImageIcon() {
        return mImageIcon;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageIcon != NO_IMAGE_PROVIDED;
    }


}
