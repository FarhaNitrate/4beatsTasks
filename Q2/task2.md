# Microsoft To Do Mobile App Test Cases - Product Module

## Create Operations

### TC-001: Create New Task with Basic Information
**Prerequisite:** User is logged into the app
**Steps:**
1. Tap "+" button to add new task
2. Enter task title "Buy groceries"
3. Tap "Add" button
**Expected Result:** New task should be created and visible in the task list
**Test Data:** Title = "Buy groceries"

### TC-002: Create Task with Due Date
**Prerequisite:** User is logged into the app
**Steps:**
1. Tap "+" to add new task
2. Enter task title "Team meeting"
3. Tap due date icon
4. Select tomorrow's date
5. Select time as 10:00 AM
6. Tap "Add" button
**Expected Result:** Task should be created with specified due date and time
**Test Data:** Title = "Team meeting", Due Date = Tomorrow, Time = 10:00 AM

### TC-003: Create Task with Reminder
**Prerequisite:** User is logged into the app
**Steps:**
1. Create new task "Doctor appointment"
2. Tap reminder icon
3. Set reminder for tomorrow at 9:00 AM
4. Save task
**Expected Result:** Task should be created with reminder set
**Test Data:** Title = "Doctor appointment", Reminder = Tomorrow 9:00 AM

### TC-004: Create Task with Repeat Option
**Prerequisite:** User is logged into the app
**Steps:**
1. Create new task "Take medication"
2. Tap repeat icon
3. Select "Daily" repeat option
4. Save task
**Expected Result:** Task should be created with daily repeat setting
**Test Data:** Title = "Take medication", Repeat = Daily

### TC-005: Create Task with Subtasks
**Prerequisite:** User is logged into the app
**Steps:**
1. Create new task "Weekly report"
2. Add subtask "Gather data"
3. Add subtask "Create charts"
4. Add subtask "Write summary"
5. Save task
**Expected Result:** Task should be created with three subtasks
**Test Data:** Main task = "Weekly report", Subtasks = ["Gather data", "Create charts", "Write summary"]

## Read Operations

### TC-006: View Task Details
**Prerequisite:** Task exists in the list
**Steps:**
1. Tap on existing task
2. Verify task details screen opens
3. Check all task information is displayed
**Expected Result:** Complete task details should be visible

### TC-007: Filter Tasks by List
**Prerequisite:** Multiple tasks exist in different lists
**Steps:**
1. Navigate to different lists
2. Verify tasks are filtered correctly
**Expected Result:** Only tasks belonging to selected list should be displayed

### TC-008: Search for Task
**Prerequisite:** Multiple tasks exist
**Steps:**
1. Tap search icon
2. Enter search term
3. Verify search results
**Expected Result:** Only tasks matching search term should be displayed

### TC-009: View Completed Tasks
**Prerequisite:** Some tasks are marked as completed
**Steps:**
1. Navigate to completed tasks section
2. Verify completed tasks are displayed
**Expected Result:** All completed tasks should be visible

### TC-010: View Task Reminders
**Prerequisite:** Tasks with reminders exist
**Steps:**
1. Navigate to planned section
2. Verify tasks with reminders are displayed
**Expected Result:** Tasks should be organized by reminder date/time

## Update Operations

### TC-011: Mark Task as Important
**Prerequisite:** Task exists
**Steps:**
1. Locate existing task
2. Tap star icon to mark as important
**Expected Result:** Task should be marked as important and appear in important list

### TC-012: Mark Task as Completed
**Prerequisite:** Task exists
**Steps:**
1. Locate existing task
2. Tap checkbox to mark as complete
**Expected Result:** Task should be marked complete and move to completed list

### TC-013: Update Task Title
**Prerequisite:** Task exists
**Steps:**
1. Open existing task
2. Tap title field
3. Modify task title
4. Save changes
**Expected Result:** Task title should be updated

### TC-014: Update Due Date
**Prerequisite:** Task with due date exists
**Steps:**
1. Open existing task
2. Tap due date
3. Change date to next week
4. Save changes
**Expected Result:** Task due date should be updated

### TC-015: Update Reminder Settings
**Prerequisite:** Task with reminder exists
**Steps:**
1. Open existing task
2. Tap reminder setting
3. Modify reminder time
4. Save changes
**Expected Result:** Task reminder should be updated

## Delete Operations

### TC-016: Delete Single Task
**Prerequisite:** Task exists
**Steps:**
1. Swipe left on task
2. Tap delete option
3. Confirm deletion
**Expected Result:** Task should be removed from list

### TC-017: Delete Multiple Tasks
**Prerequisite:** Multiple tasks exist
**Steps:**
1. Long press to enter selection mode
2. Select multiple tasks
3. Tap delete option
4. Confirm deletion
**Expected Result:** All selected tasks should be removed

### TC-018: Delete Completed Tasks
**Prerequisite:** Completed tasks exist
**Steps:**
1. Navigate to completed tasks
2. Tap "Clear completed tasks"
3. Confirm deletion
**Expected Result:** All completed tasks should be removed

### TC-019: Delete Task List with Tasks
**Prerequisite:** List with tasks exists
**Steps:**
1. Long press on list
2. Select delete option
3. Confirm deletion
**Expected Result:** List and all its tasks should be deleted

### TC-020: Delete Subtasks
**Prerequisite:** Task with subtasks exists
**Steps:**
1. Open task with subtasks
2. Swipe left on subtask
3. Tap delete option
4. Verify subtask removal
**Expected Result:** Subtask should be removed while main task remains
