# Shopify Web Application Test Cases

## Account Management Module
### TC-001: User Registration
**Prerequisite:** User is on Shopify homepage
**Steps:**
1. Click "Start free trial" button
2. Enter valid email address
3. Enter password
4. Enter store name
5. Click "Create your store" button
**Expected Result:** Account should be created successfully with confirmation email

### TC-002: User Login
**Prerequisite:** User has registered account
**Steps:**
1. Click "Login" button
2. Enter registered email
3. Enter valid password
4. Click "Log in" button
**Expected Result:** User should be logged in successfully and directed to dashboard

### TC-003: Password Reset
**Prerequisite:** User has registered account
**Steps:**
1. Click "Login" button
2. Click "Forgot password"
3. Enter registered email
4. Click "Submit"
**Expected Result:** Password reset email should be sent

## Store Setup Module
### TC-004: Create New Store
**Prerequisite:** User is logged in
**Steps:**
1. Navigate to store creation section
2. Enter store name
3. Select business category
4. Choose store location
5. Click "Create store" button
**Expected Result:** New store should be created successfully

### TC-005: Update Store Details
**Prerequisite:** Store exists
**Steps:**
1. Go to store settings
2. Update store name
3. Modify business address
4. Change store currency
5. Save changes
**Expected Result:** Store details should be updated successfully

## Product Management Module
### TC-006: Add New Product
**Prerequisite:** User is logged into store admin
**Steps:**
1. Navigate to Products section
2. Click "Add product"
3. Enter product title
4. Add description
5. Set price
6. Upload product image
7. Click "Save"
**Expected Result:** Product should be created and visible in product list

### TC-007: Edit Product
**Prerequisite:** Product exists in store
**Steps:**
1. Go to Products section
2. Select existing product
3. Modify product details
4. Update price
5. Save changes
**Expected Result:** Product should be updated with new information

### TC-008: Delete Product
**Prerequisite:** Product exists in store
**Steps:**
1. Go to Products section
2. Select product to delete
3. Click delete button
4. Confirm deletion
**Expected Result:** Product should be removed from store

## Inventory Management Module
### TC-009: Add Product Variants
**Prerequisite:** Product exists
**Steps:**
1. Select existing product
2. Click "Add variant"
3. Set variant options (size, color)
4. Set variant price
5. Set inventory quantity
6. Save changes
**Expected Result:** Product variants should be created successfully

### TC-010: Update Inventory
**Prerequisite:** Product with inventory exists
**Steps:**
1. Go to Inventory section
2. Select product
3. Modify inventory count
4. Save changes
**Expected Result:** Inventory should be updated correctly

## Order Management Module
### TC-011: Create Test Order
**Prerequisite:** Store has active products
**Steps:**
1. Go to Orders section
2. Click "Create order"
3. Add products to order
4. Add customer details
5. Select shipping method
6. Complete order
**Expected Result:** Order should be created successfully

### TC-012: Process Order
**Prerequisite:** Order exists
**Steps:**
1. Select order from list
2. Update order status
3. Add tracking information
4. Mark as fulfilled
**Expected Result:** Order should be processed and status updated

## Theme Customization Module
### TC-013: Change Store Theme
**Prerequisite:** Store exists
**Steps:**
1. Go to Online Store > Themes
2. Browse theme store
3. Select new theme
4. Preview theme
5. Activate theme
**Expected Result:** New theme should be applied successfully

### TC-014: Customize Theme
**Prerequisite:** Active theme exists
**Steps:**
1. Go to theme customizer
2. Modify header
3. Update color scheme
4. Change font styles
5. Save changes
**Expected Result:** Theme customizations should be saved and visible

## Payment Settings Module
### TC-015: Configure Payment Provider
**Prerequisite:** Store is set up
**Steps:**
1. Go to Settings > Payments
2. Select payment provider
3. Enter required credentials
4. Complete verification process
5. Activate payment method
**Expected Result:** Payment provider should be configured successfully

## Discount Module
### TC-016: Create Discount Code
**Prerequisite:** Store has products
**Steps:**
1. Go to Discounts section
2. Click "Create discount"
3. Set discount type
4. Set discount amount
5. Set validity period
6. Save discount
**Expected Result:** Discount code should be created and active

### TC-017: Edit Discount
**Prerequisite:** Discount exists
**Steps:**
1. Select existing discount
2. Modify discount parameters
3. Update validity period
4. Save changes
**Expected Result:** Discount should be updated successfully

## Navigation Menu Module
### TC-018: Create Menu Item
**Prerequisite:** Store exists
**Steps:**
1. Go to Navigation
2. Select menu to edit
3. Add new menu item
4. Set item link
5. Save changes
**Expected Result:** New menu item should be added to navigation

### TC-019: Modify Store Navigation
**Prerequisite:** Menu exists
**Steps:**
1. Go to Navigation settings
2. Reorder menu items
3. Update menu structure
4. Save changes
**Expected Result:** Navigation structure should be updated

## Search Functionality
### TC-020: Product Search
**Prerequisite:** Store has products
**Steps:**
1. Go to Products section
2. Enter search term in search bar
3. Apply filters (if any)
4. Verify search results
**Expected Result:** Relevant products should be displayed in search results
